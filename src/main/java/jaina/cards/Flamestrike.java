package jaina.cards;

import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.status.Burn;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import jaina.modCore.IHelper;
import jaina.modCore.JainaEnums;

public class Flamestrike extends AbstractJainaCard {
    public static final String ID = IHelper.makeID("Flamestrike");
    private static final CardStrings CARD_STRINGS = CardCrawlGame.languagePack.getCardStrings(ID);

    private static final int COST = 1;

    public Flamestrike() {
        super(ID, false, CARD_STRINGS, COST, CardType.ATTACK, JainaEnums.JAINA_COLOR,
                CardRarity.COMMON, CardTarget.ALL_ENEMY, JainaEnums.CardTags.FIRE);
        setDamage(6);
        cardsToPreview = new Burn();
        setDamageType(JainaEnums.DamageType.FIRE);
    }

    @Override
    public void use(AbstractPlayer p, AbstractMonster m) {
        dealAoeDamage(AbstractGameAction.AttackEffect.FIRE);
        dealAoeDamage(AbstractGameAction.AttackEffect.FIRE);
        getBurn(1);
    }

    @Override
    public void upp() {
        upgradeDamage(2);
    }

    @Override
    public AbstractCard makeCopy() {
        return new Flamestrike();
    }
}