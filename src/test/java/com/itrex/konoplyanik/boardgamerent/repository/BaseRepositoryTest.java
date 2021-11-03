package com.itrex.konoplyanik.boardgamerent.repository;

import org.flywaydb.core.Flyway;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itrex.konoplyanik.boardgamerent.config.ApplicationContextConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationContextConfiguration.class)
public abstract class BaseRepositoryTest {
	
	@Autowired
	private Flyway flyway;
	
	@Before
    public void initDB() {
        flyway.migrate();
    }

	@After
    public void cleanDB() {
        flyway.clean();
    }

}
