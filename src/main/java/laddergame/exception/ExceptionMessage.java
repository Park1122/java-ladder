package laddergame.exception;

public enum ExceptionMessage {
    WRONG_PLAYER_NAME_MESSAGE("(%s): 참여자의 이름은 최대 %d글자이어야 합니다."),
    WRONG_SIZE_OF_PLAYERS_MESSAGE("참여자는 중복일 수 없으며 %d명 이상이어야 합니다."),
    WRONG_WINNING_CONTENT_MESSAGE("(%s): 결과는 최대 %d글자이어야 합니다."),
    WRONG_SIZE_OF_WINNING_CONTENTS_MESSAGE("결과는 %d개 이상이어야 합니다."),
    WRONG_PLAYERS_AND_WINNING_CONTENTS_MESSAGE("참여자와 결과의 개수는 동일해야 합니다."),
    WRONG_LADDER_HEIGHT_MESSAGE("(%s): 사다리 높이는 %d 이상의 양의 정수이어야 합니다."),
    WRONG_LINE_MESSAGE("Line.links의 크기는 0보다 커야 하며 LINKED를 연속적으로 가질 수 없습니다."),
    WRONG_PLAYERS_AND_WINNING_CONTENTS_FOR_LADDER_MESSAGE("참여자 및 결과가 사다리에 맞지 않습니다.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
