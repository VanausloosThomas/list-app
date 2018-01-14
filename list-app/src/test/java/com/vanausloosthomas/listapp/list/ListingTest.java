package com.vanausloosthomas.listapp.list;

import org.junit.Test;

import java.util.ArrayList;

import static com.vanausloosthomas.listapp.list.ListItem.ListItemBuilder.listItemBuilder;
import static com.vanausloosthomas.listapp.list.Listing.ListingBuilder.listingBuilder;
import static org.assertj.core.api.Assertions.assertThat;

public class ListingTest {

    @Test
    public void getListItems_whenCallingThisMethod_thenTheReturnedListIsNotTheSameAsTheListOnTheListingObject() {
        ArrayList<ListItem> originalArrayList = new ArrayList<>();
        ListItem item1 = listItemBuilder()
                .withId("1")
                .withName("item1")
                .build();
        ListItem item2 = listItemBuilder()
                .withId("2")
                .withName("item2")
                .build();
        originalArrayList.add(item1);
        originalArrayList.add(item2);

        Listing listing = listingBuilder()
                .withListItems(originalArrayList)
                .build();

        assertThat(listing.getListItems()).isNotSameAs(originalArrayList);
        assertThat(listing.getListItems()).contains(item1,item2);
    }

    @Test
    public void listingBuilder_whenMakingAListingWithTheBuilder_thenReturnsCorrectListing() {
        ListItem item1 = listItemBuilder()
                .withName("item1")
                .build();
        Listing listing = listingBuilder()
                .withListItem(item1)
                .withListName("myPersonalTestList")
                .withId("justAnId")
                .build();

        assertThat(listing.getListItems().size()).isEqualTo(1);
        assertThat(listing.getListItems()).contains(item1);
        assertThat(listing.getId()).isEqualTo("justAnId");
        assertThat(listing.getListName()).isEqualTo("myPersonalTestList");
    }
}