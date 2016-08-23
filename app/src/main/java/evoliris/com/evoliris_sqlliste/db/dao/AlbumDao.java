package evoliris.com.evoliris_sqlliste.db.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import evoliris.com.evoliris_sqlliste.db.DBHelper;

/**
 * Created by temp on 23/08/2016.
 */
public class AlbumDao {

    public static final String TABLE_NAME = "album";

    public static final String COL_ID = "_id";
    public static final String COL_TITLE = "title";
    public static final String COL_OUT_DATE = "out_date";
    public static final String COL_RATING = "rating";
    public static final String COL_GENRE = "genre";
    public static final String COL_IMAGE_URL = "image_url";
    public static final String COL_FAVORITE = "favorite";

    public static final String CREATE_REQUEST = "CREATE TABLE " + TABLE_NAME
            + "("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COL_TITLE + "TEXT NOT NULL,"
            + COL_OUT_DATE + "DATE,"
            + COL_GENRE + "TEXT,"
            + COL_IMAGE_URL + "TEXT,"
            + COL_FAVORITE + "BOOLEAN NOT NULL,"
            + COL_RATING + "FLOAT"
            + ");";

    public static final String DROP_REQUEST = "DROPE TABLE" + TABLE_NAME;

    private DBHelper helper;
    private Context context;
    private SQLiteDatabase db;

    public AlbumDao (Context context){
        this.context=context;
    }

    public AlbumDao openWritable(){
        helper= new DBHelper(context);
        db=helper.getWritableDatabase();
        return this;
    }

    public AlbumDao openReadable(){
        helper= new DBHelper(context);
        db=helper.getWritableDatabase();
        return this;

    }

    public void close(){
        helper.close();
        db.close();
    }
}
