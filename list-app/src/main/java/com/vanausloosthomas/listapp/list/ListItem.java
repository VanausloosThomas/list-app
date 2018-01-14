package com.vanausloosthomas.listapp.list;

import com.vanausloosthomas.listapp.general.NestedBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = ListItem.TABLE_LISTITEM)
public class ListItem {

    static final String TABLE_LISTITEM = "LISTITEM";
    private static final String COLUMN_ID = "LISTITEM_ID";
    private static final String COLUMN_NAME = "LISTITEM_NAME";
    private static final String COLUMN_LISTING_ID = "LISTING_ID";

    @Id
    @Column(name = COLUMN_ID)
    private String id;
    @Column(name = COLUMN_NAME)
    private String name;
    @Column(name = COLUMN_LISTING_ID)
    private String listingId;


    private ListItem() {
    }

    private ListItem(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static class ListItemBuilder extends NestedBuilder<ListItem> {

        public static ListItemBuilder listItemBuilder(){
            return new ListItemBuilder();
        }
        private ListItemBuilder() {
        }

        @Override
        protected ListItem createInstance() {
            return new ListItem(UUID.randomUUID().toString());
        }

        public ListItemBuilder withId(String id) {
            instance().id = id;
            return this;
        }

        public ListItemBuilder withName(String name) {
            instance().name = name;
            return this;
        }
    }
}
