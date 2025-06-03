.class public abstract Lec/m;
.super Lec/q;
.source "SourceFile"

# interfaces
.implements Ljc/f;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lec/q;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a()Ljc/f$a;
    .locals 1

    invoke-virtual {p0}, Lec/q;->e()Ljc/h;

    move-result-object v0

    check-cast v0, Ljc/f;

    invoke-interface {v0}, Ljc/f;->a()Ljc/f$a;

    move-result-object v0

    return-object v0
.end method

.method public final computeReflected()Ljc/b;
    .locals 1

    sget-object v0, Lec/t;->a:Lec/u;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, Ljc/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
