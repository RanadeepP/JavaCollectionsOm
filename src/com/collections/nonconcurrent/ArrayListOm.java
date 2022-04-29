package com.collections.nonconcurrent;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ArrayListOm<E> implements RandomAccess, Cloneable, java.io.Serializable {

    /*Cloneable and Serializable are marker interfaces.They are empty interfaces having no methods*/

    private static final int DEFAULT_CAPACITY = 10;

    // Shared empty array instance used for empty instances.
    private static final Object[] EMPTY_ELEMENTDATA = {};

    /**
     * Shared empty array instance used for default sized empty instances. We
     * distinguish this from EMPTY_ELEMENTDATA to know how much to inflate when
     * first element is added.
     */

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};






}
