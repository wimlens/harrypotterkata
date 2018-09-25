package harrypotterkata.hogwarts.spell;

import harrypotterkata.hogwarts.random.RandomEnum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum  Spell {
    CONFRINGO("attacking", 10),
    PETRIFICUS_TOTALUS("attacking", 15),
    LEVICORPUS("attacking", 12),
    REDUCTO("attacking", 7),
    RICTUSEMPRA("attacking", 17),
    SECTUMSEMPRA("attacking", 9),
    STUPEFY("attacking", 6),

    EXPELLIARMUS("defensive", 0),
    EXPECTO_PATRONUM("defensive", 0),
    PROTEGO("defensive", 0),

    CRUCIO("unforgivable", 50),
    IMPERIO("unforgivable", 50),
    AVADA_KEDAVRA("unforgivable", 50);

    private String kindOfSpell;
    private int damage;

    Spell(String kindOfSpell, int damage) {
        this.kindOfSpell = kindOfSpell;
        this.damage = damage;
    }

    public static List<Spell> getAttackingSpells(){
        return Arrays.stream(Spell.values())
                .filter(spell -> spell.kindOfSpell.equals("attacking"))
                .collect(Collectors.toList());
    }

    public static List<Spell> getDefensiveSpells(){
        return Arrays.stream(Spell.values())
                .filter(spell -> spell.kindOfSpell.equals("defensive"))
                .collect(Collectors.toList());
    }

    public static List<Spell> getHorribleUnforgivableSpells(){
        return Arrays.stream(Spell.values())
                .filter(spell -> spell.kindOfSpell.equals("unforgivable"))
                .collect(Collectors.toList());
    }

    public static Spell getRandomSpell(){
        return RandomEnum.getRandom(Spell.class);
    }

    public int getDamage() {
        return damage;
    }
}