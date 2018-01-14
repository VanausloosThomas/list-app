package com.vanausloosthomas.listapp.general;

public abstract class NestedBuilder<T> {

    private T instance;

    public NestedBuilder() {
        this.instance = createInstance();
    }

    protected final T instance(){
        return instance;
    }
    public T build(){
        return instance;
    }
    protected abstract T createInstance();
}

