package com.tw.api.unit.test.services;


import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ShowServiceTests {
	private static final String MOCK_OUTPUT = "Mocked show label";

	@Mock
	private TextService textService;

	@InjectMocks
	private ShowService showService;

	@Before
	public void setMockOutput() {
		when(textService.getText()).thenReturn(MOCK_OUTPUT);
	}

	@Test
	public void contextLoads() {

		Assert.assertEquals(showService.getShowLable(), MOCK_OUTPUT);

	}

}
