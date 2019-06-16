package cc3002.tarea2.game.cards.pokemon.types.phases.base;

import cc3002.tarea2.game.Trainer;
import cc3002.tarea2.game.ability.IAbility;
import cc3002.tarea2.game.cards.pokemon.types.AbstractFightingPokemon;
import cc3002.tarea2.game.cards.pokemon.types.phases.IBasicPokemon;
import cc3002.tarea2.game.visitor.card.ICardVisitor;

/**
 * Class representing fighting basic Pokemons.
 *
 * @author Juan Urrutia
 */
public abstract class FightingBasePokemon extends AbstractFightingPokemon implements IBasicPokemon {
    /**
     * Creates a fighting type base pokemon.
     *  @param hp      The initial hp of the AbstractPokemonCard.
     * @param id    The pokemon id
     * @param name  The pokemon name
     * @param abilities An array with the attacks of the AbstractPokemonCard.
     * @param trainer The trainer owner of the AbstractPokemonCard.
     */
    public FightingBasePokemon(int hp, int id, String name, IAbility[] abilities, Trainer trainer) {
        super(hp, id, name, abilities, trainer);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void accept(ICardVisitor visitor) {
        super.accept(visitor);
        visitor.visitBasicPokemon(this);
    }
}
