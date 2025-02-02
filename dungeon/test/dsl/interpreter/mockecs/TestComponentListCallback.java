package dsl.interpreter.mockecs;

import dsl.annotation.DSLCallback;
import dsl.annotation.DSLContextMember;
import dsl.annotation.DSLType;
import java.util.List;
import java.util.function.Function;

@DSLType
public class TestComponentListCallback extends Component {
  private Entity entity;

  public Entity getEntity() {
    return entity;
  }

  @DSLCallback private Function<List<Entity>, Boolean> onInteraction;

  public Function<List<Entity>, Boolean> getOnInteraction() {
    return onInteraction;
  }

  public TestComponentListCallback(@DSLContextMember(name = "entity") Entity entity) {
    super(entity);
    this.entity = entity;
  }

  public Boolean executeCallbackWithText(List<Entity> entities) {
    return onInteraction.apply(entities);
  }
}
