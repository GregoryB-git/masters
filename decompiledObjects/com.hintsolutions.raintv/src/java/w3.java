/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  ru.tvrain.core.data.Program
 *  ru.tvrain.core.data.Programs
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.programs.ProgramsFragment;
import com.hintsolutions.raintv.programs.adapters.ProgramsSectionedAdapter;
import ru.tvrain.core.data.Program;
import ru.tvrain.core.data.Programs;
import rx.functions.Action1;

public final class w3
implements ProgramsSectionedAdapter.OnFavoriteClickListener,
Action1 {
    public final int a;
    public final ProgramsFragment b;

    public /* synthetic */ w3(ProgramsFragment programsFragment, int n4) {
        this.a = n4;
        this.b = programsFragment;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 5: {
                ProgramsFragment.j(this.b, (Programs)object);
                return;
            }
            case 4: {
                ProgramsFragment.e(this.b, (Throwable)object);
                return;
            }
            case 3: {
                ProgramsFragment.c(this.b, (Programs)object);
                return;
            }
            case 2: {
                ProgramsFragment.g(this.b, (Throwable)object);
                return;
            }
            case 1: {
                ProgramsFragment.i(this.b, (Programs)object);
                return;
            }
        }
        ProgramsFragment.h(this.b, (Throwable)object);
    }

    @Override
    public final void onClick(Program program) {
        ProgramsFragment.k(this.b, program);
    }
}

