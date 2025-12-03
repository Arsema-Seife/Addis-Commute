package interfaces;

import java.util.List;

/**
 * Generic interface for loading and saving data.
 * T represents the type of object (BusStop or BusRoute).
 */
public interface Loadable<T> {
    List<T> loadFromFile(String filename);
    void saveToFile(String filename, List<T> items);
}
