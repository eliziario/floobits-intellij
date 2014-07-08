package floobits.common;

import java.io.InputStream;

/**
 * Created by kans on 7/7/14.
 */
public abstract class VFile {
    public abstract String getPath();
    public abstract VDoc getDocument();
    public abstract boolean rename(Object obj, String name);
    public abstract void createDirectories(String dir);
    public abstract boolean move(Object obj, VFile d);
    public abstract boolean delete(Object obj);
    public abstract VFile[] getChildren();
    public abstract String getName();
    public abstract long getLength();
    public abstract InputStream getInputStream();
    public abstract boolean isDirectory();
    public abstract boolean isSpecial();
    public abstract boolean isSymLink();
    public abstract boolean isValid();
    protected abstract byte[] contentsToByteArray();
}
