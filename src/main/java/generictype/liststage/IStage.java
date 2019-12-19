package generictype.liststage;

/**
 * @author YangJin
 */
public interface IStage<T extends AbstractStageParameter> {
    void execute(T parameter);
}
