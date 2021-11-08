package com.itrex.konoplyanik.boardgamerent.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.itrex.konoplyanik.boardgamerent.dto.RentDTO;
import com.itrex.konoplyanik.boardgamerent.entity.Order;
import com.itrex.konoplyanik.boardgamerent.exception.RepositoryException;
import com.itrex.konoplyanik.boardgamerent.exception.ServiceException;
import com.itrex.konoplyanik.boardgamerent.repository.OrderRepository;
import com.itrex.konoplyanik.boardgamerent.repository.RentRepository;
import com.itrex.konoplyanik.boardgamerent.service.RentService;
import com.itrex.konoplyanik.boardgamerent.util.Converter;

@Service
public class RentServiceImpl implements RentService {

	private final RentRepository rentRepository;
	private final OrderRepository orderRepository;
	
	public RentServiceImpl(RentRepository rentRepository,
			OrderRepository orderRepository) {
		this.rentRepository = rentRepository;
		this.orderRepository = orderRepository;
	}

	@Override
	public RentDTO findById(Long id) throws ServiceException {
		try {
			return Converter.convertRentToDTO(rentRepository.findById(id));
		} catch (RepositoryException ex) {
			throw new ServiceException("Error: findById: " + ex);
		}
	}

	@Override
	public RentDTO add(RentDTO rent) throws ServiceException {
		try {
			return Converter.convertRentToDTO(rentRepository.add(Converter.convertRentToEntity(rent)));
		} catch (RepositoryException ex) {
			throw new ServiceException("Error: update: " + ex);
		}
	}

	@Override
	public RentDTO update(RentDTO rent) throws ServiceException {
		try {
			return Converter.convertRentToDTO(rentRepository.update(Converter.convertRentToEntity(rent)));
		} catch (RepositoryException ex) {
			throw new ServiceException("Error: update: " + ex);
		}
	}

	@Override
	public boolean delete(Long id) throws ServiceException {
		Order order = orderRepository.findById(rentRepository.findById(id).getOrderId());
		try {
			return rentRepository.delete(id);
		} catch (RepositoryException ex) {
			throw new ServiceException("Error: update: " + ex);
		} finally {
			if (order.getPurchases().size() == 0 && order.getRents().size() == 0) {
				orderRepository.delete(order.getId());
			}
		}
	}

	@Override
	public List<RentDTO> findRentsByOrder(Long orderId) throws ServiceException {
		try {
			return rentRepository.findRentsByOrder(orderId).stream()
					.map(rent -> Converter.convertRentToDTO(rent))
					.collect(Collectors.toList());
		} catch (RepositoryException ex) {
			throw new ServiceException("Error: findRentsByOrder: " + ex);
		}
	}

}
