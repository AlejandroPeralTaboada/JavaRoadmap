package com.alexperal.training.java.basic.b01;

public class ClassesAndFields {

    public static String WORST = "This is not final and it is public";
    protected static String WORSE = "This is not final and is accessible";
    static String BAD = "Same as before";
    private static String WORSE_2 = "This might be ok but is not useful";

    public final static String CONSTANT = "This is ok but why public";
    protected final static String WEIRD_CONSTANT = "Not used a lot";
    static final String WEIRD_CONSTANT_2 = "Same as before";
    private final static String NO_SHARED_CONSTANT = "This is usually ok";

    public String worst = "This is not final and it is public, use a getter if needed";
    protected String mightBeOk = "Used sometimes in inheritance, not recommended";
    String notSoOkAsBefore = "Very unused nowadays";
    private String ok = "The most common";

    public final String shareableField = "Getter is recommended but at least cannot be modified if the type is immutable as well";
    protected final String mightBeOkButIsBetter = "Not used a lot";
    final String notUsualButOk = "Not used a lot";
    private final String best = "Tha BEST :D";


}
