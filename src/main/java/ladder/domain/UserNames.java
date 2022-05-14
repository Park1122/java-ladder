package ladder.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserNames {

  private static final String DELIMITER = ",";
  private final List<UserName> value;

  private UserNames(String userNames) {
    this.value = Arrays.stream(userNames.split(DELIMITER))
        .map(UserName::from)
        .collect(Collectors.toList());
  }

  public static UserNames from(String userNames) {
    return new UserNames(userNames);
  }

  public int getUserSize() {
    return this.value.size();
  }

  public String getUserName(int userIdx) {
    return value.get(userIdx).getName();
  }
}
