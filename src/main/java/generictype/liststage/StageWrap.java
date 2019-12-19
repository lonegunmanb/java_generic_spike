package generictype.liststage;

/**
 * @author YangJin
 */
public class StageWrap<T extends  AbstractStageParameter> {
    IStage<T> Stage;

    T Parameter;

    public StageWrap(IStage<T> stage, T parameter) {
        Stage = stage;
        Parameter = parameter;
    }

    public void execute() {
        this.Stage.execute(this.Parameter);
    }
}
