import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;


public class WarmupTest {

  @Test
  void from1to100() {
    // given
    int[] array = IntStream.range(1,101).toArray();
    // when
    int[] actualArray = Warmup.from1to100();
    // then
    assertThat(actualArray).hasSize(100).isEqualTo(array);
  }
}
