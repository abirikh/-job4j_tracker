package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {

    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        tracker.delete(item.getId());
        Item deleted = tracker.findById(item.getId());
        assertThat(deleted).isNull();
    }
}