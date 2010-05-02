Ext.onReady(function(){

	var store = new Ext.data.Store({
		proxy: new Ext.data.HttpProxy({
			url: 'getBooks.action'
		}),
		reader: new Ext.data.JsonReader({
			root:'books'
		},
		[{name: 'id'}, 
		 {name: 'title'},
		 {name: 'publisher'},
		 {name: 'isbn10'},
		 {name: 'isbn13'},
		 {name: 'link'},
		 {name: 'description'},
		])
	});

	// row expander
    var expander = new Ext.ux.grid.RowExpander({
        tpl : new Ext.Template(
            '<br><p><b>ISBN10:</b> {isbn10}</p><br>',
            '<p><b>ISBN13:</b> {isbn13}</p><br>',
            '<p><b>Link:</b> <a href="{link}" target="_blank">{link}</a></p><br>',
            '<p><b>Description:</b> {description}</p>'
        )
    });
    
    var gridBooks = new Ext.grid.GridPanel({
        store: store,
        cm: new Ext.grid.ColumnModel({
            defaults: {
                sortable: true,
                width: 200
            },
            columns: [
                expander,
                {header: "Title", dataIndex: 'title'},
                {header: "Publisher", dataIndex: 'publisher'}
            ]
        }),
        width: 430,
        height: 270,
        plugins: expander,
        title: 'ExtJS Books',
        renderTo: 'gridBooks'
    });

    store.load();
});