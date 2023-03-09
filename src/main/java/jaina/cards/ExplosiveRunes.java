package jaina.cards;

import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import jaina.modCore.IHelper;
import jaina.modCore.JainaEnums;
import jaina.powers.unique.ExplosiveRunesPower;


public class ExplosiveRunes extends AbstractFireCard {

    public static final String ID = IHelper.makeID("ExplosiveRunes");
    private static final CardStrings CARD_STRINGS = CardCrawlGame.languagePack.getCardStrings(ID);

    private static final int COST = 1;

    public ExplosiveRunes() {
        super(ID, false, CARD_STRINGS, COST, CardType.POWER, JainaEnums.JAINA_COLOR,
                CardRarity.UNCOMMON, CardTarget.NONE);
        setDamage(10);
    }

    @Override
    public void upp() {
        upgradeDamage(5);
    }

    @Override
    public void use(AbstractPlayer p, AbstractMonster m) {
        gainPower(new ExplosiveRunesPower(p, damage));
    }

    @Override
    public AbstractCard makeCopy() {
        return new ExplosiveRunes();
    }

}
