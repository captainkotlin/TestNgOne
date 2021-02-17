package utils;

import java.util.stream.Stream;

public abstract class AbstractDataProvider<T>
{
    public abstract Stream<T> getData();
}
