package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GT4500Test {

  @Mock
  private GT4500 ship;
  @Rule public MockitoRule mockitoRule = MockitoJUnit.rule(); 
  @BeforeEach
  public void init(){

    this.ship = new GT4500(mock(TorpedoStore.class), mock(TorpedoStore.class));
  }

  @Test
  public void fireTorpedo_Single_Success(){
    // Arrange
    when(ship.getPrimaryTorpedoStore().getTorpedoCount().thenReturn());
    ship.getPrimaryTorpedoStore().getTorpedoCount();
    verify(ship.getPrimaryTorpedoStore(), times(1)).getTorpedoCount();
    // Act
    boolean result = ship.fireTorpedo(FiringMode.SINGLE);

    // Assert
    assertEquals(true, result);
  }

  @Test
  public void fireTorpedo_All_Success(){
    // Arrange
    when(ship.getPrimaryTorpedoStore().getTorpedoCount().thenReturn());
    ship.getPrimaryTorpedoStore().getTorpedoCount();
    verify(ship.getPrimaryTorpedoStore(), times(1)).getTorpedoCount();
    // Act
    boolean result = ship.fireTorpedo(FiringMode.ALL);

    // Assert
    assertEquals(false, result);
  }

}
