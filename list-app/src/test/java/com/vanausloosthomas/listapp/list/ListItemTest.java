package com.vanausloosthomas.listapp.list;

import org.junit.Test;

import static com.vanausloosthomas.listapp.list.ListItem.ListItemBuilder.listItemBuilder;
import static org.assertj.core.api.Assertions.assertThat;

public class ListItemTest {


    @Test
    public void listItemBuilder_whenMakingAListItemWithTheBuilder_thenWeGetACorrectListItemBack() {
        ListItem listItem = listItemBuilder().withName("aName").build();

        assertThat(listItem.getId()).isNotBlank();
        assertThat(listItem.getName()).isEqualTo("aName");
    }

    @Test
    public void listItemBuilder_whenMakingAListItemWithAnId_thenThatIdOverwritesTheDefaultId() {
        ListItem listItem = listItemBuilder().withName("aName").withId("ID").build();

        assertThat(listItem.getId()).isNotBlank();
        assertThat(listItem.getId()).isEqualTo("ID");
    }

    @Test
    public void listItemBuilder_whenMakingAListItemWithoutIdSpecified_thenADefaultIDGetsCreated() {
        ListItem listItem = listItemBuilder().withName("aName").build();

        assertThat(listItem.getId()).isNotBlank();
    }

}