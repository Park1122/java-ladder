package ladder.rowgenerator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RowGeneratorRandomTest {
  @ParameterizedTest
  @ValueSource(ints = { 3, 4, 5, 6 })
  void 무작위로_사다리행_생성(final int input) {
    RowGeneratorRandom generator = new RowGeneratorRandom();
    Assertions.assertThat(generator.generate(input, 0).size()).isEqualTo(input);
  }
}
