package semanticanalysis.types;

import graph.Graph;

@DSLType
public class TestClassOuter {
    @DSLTypeMember private String member1;
    @DSLTypeMember private int member2;
    @DSLTypeMember private Graph<String> member3;
    private Object member4;
}
