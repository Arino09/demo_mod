package Jaina.powers;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.megacrit.cardcrawl.helpers.ImageMaster;
import com.megacrit.cardcrawl.powers.AbstractPower;

public class AbstractJainaPower extends AbstractPower {

    public AbstractJainaPower(String id, boolean useTestArt, String name, PowerType type) {
        this.ID = id;
        this.name = name;
        this.type = type;
        if(useTestArt) {
            loadRegion("test");
            return;
        }
        loadRegion(id);
    }

    /**
     * 加载图标
     * @param name 能力ID的后半段，输入test以使用测试图标
     */
    @Override
    public void loadRegion(String name) {
        this.region48 = new TextureAtlas.AtlasRegion(ImageMaster.loadImage(
                "Jaina/img/powers/" + name + "32.png"),0,0,32,32);
        this.region128 = new TextureAtlas.AtlasRegion(ImageMaster.loadImage(
                "Jaina/img/powers/" + name + "84.png"),0,0,84,84);
    }
}
