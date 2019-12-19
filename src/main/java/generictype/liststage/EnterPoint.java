package generictype.liststage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author YangJin
 */
public class EnterPoint {
//    /**
//     *
//     */
//    IStage<AbstractStageParameter> stage;
//
//    public EnterPoint() {
//        stage = null;
//    }

    static IStage<AParameter> astage;

    static IStage<BParameter> bstage;

    public EnterPoint() {
        astage = new AStage();
        bstage = new BStage();
    }

    public static void main(final String[] args) throws Exception {
        AParameter aParameter = new AParameter();
        BParameter bParameter = new BParameter();

//        List<StageWrap<? extends AbstractStageParameter>> stageWraps
//                = new ArrayList<>(Arrays.asList(
//                        new StageWrap(astage, aParameter)
//                        , new StageWrap(bstage, bParameter)));

        List<StageWrap<? extends AbstractStageParameter>> stageWraps = new ArrayList<>();
        stageWraps.add(new StageWrap<>(astage, aParameter));
        stageWraps.add(new StageWrap<>(bstage, bParameter));

        stageWraps.stream().forEach(StageWrap::execute);
    }
}
