package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:springContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ImageSearchServiceTest
{
  @Autowired
  ImageSearchService service;

  @Test
  public void testGetSource()
  {
    Assert.assertNotNull(service);
    Assert.assertNotNull(service.getSource());
  }
}
