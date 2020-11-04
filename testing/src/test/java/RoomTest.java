import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoomTest
{
  Room room;

  @BeforeEach
  void setUp() {
    room = new Room(2, 3, 4);
  }

  @Test
  void testCalculateRoomArea() {
    // given
    double expectedArea = 12.0;
    double invalidArea = 11.0;
    // when
    double calculateArea = room.calculateArea();

    // then
    assertThat(calculateArea).isEqualTo(expectedArea);
    assertThat(calculateArea).isNotEqualTo(invalidArea);
  }

  @Test
  void testCalculateRoomVolume() {
    // given
    double expectedRoomVolume = 24.0;
    double invalidRoomVolume = 11.0;

    // when
    double calculateRoomVolume = room.calculateVolume();

    // then
    assertThat(calculateRoomVolume).isNotEqualTo(invalidRoomVolume);
    assertThat(calculateRoomVolume).isEqualTo(expectedRoomVolume);
  }
}
