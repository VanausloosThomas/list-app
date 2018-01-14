package com.vanausloosthomas.listapp.list;

import com.vanausloosthomas.listapp.general.NestedBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static java.util.UUID.randomUUID;

@Entity
@Table(name = Listing.TABLE_LISTING)
public class Listing {

    static final String TABLE_LISTING = "LISTING";
    private static final String COLUMN_ID = "LISTING_ID";
    private static final String COLUMN_LISTNAME = "LISTNAME";

    @Id
    @Column(name = COLUMN_ID)
    private String id;
    @Column(name = COLUMN_LISTNAME)
    private String listName;

    @OneToMany(mappedBy = "id")
    private List<ListItem> listItems;


    private Listing() {
    }

    private Listing(String id) {
        this.id = id;
        this.listItems = new ArrayList<>();
    }

    private void addListItem(ListItem listItem) {
        this.listItems.add(listItem);
    }

    public String getId() {
        return id;
    }

    public String getListName() {
        return listName;
    }

    public ArrayList<ListItem> getListItems() {
        return new ArrayList<>(listItems);
    }

    public static class ListingBuilder extends NestedBuilder<Listing> {

        public static ListingBuilder listingBuilder(){
            return new ListingBuilder();
        }

        private ListingBuilder() {
        }

        @Override
        protected Listing createInstance() {
            return new Listing(randomUUID().toString());
        }

        public ListingBuilder withId(String id) {
            instance().id = id;
            return this;
        }

        public ListingBuilder withListName(String listName) {
            instance().listName = listName;
            return this;
        }

        public ListingBuilder withListItem(ListItem listItem) {
            instance().addListItem(listItem);
            return this;
        }

        public ListingBuilder withListItems(List<ListItem> listItems) {
            instance().listItems = listItems;
            return this;
        }
    }
}
