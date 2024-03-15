package hello.itemservice.domain.item;

public enum ItemType {

    BOOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    ItemType(String description) {
        this.description = description;
    }
}
