.class public abstract Lec/o;
.super Lec/q;
.source "SourceFile"

# interfaces
.implements Ljc/g;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 6

    sget-object v1, Lec/b;->NO_RECEIVER:Ljava/lang/Object;

    const-string v3, "dataStore"

    const-string v4, "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lec/q;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a()Ljc/g$a;
    .locals 1

    invoke-virtual {p0}, Lec/q;->e()Ljc/h;

    move-result-object v0

    check-cast v0, Ljc/g;

    invoke-interface {v0}, Ljc/g;->a()Ljc/g$a;

    move-result-object v0

    return-object v0
.end method

.method public final computeReflected()Ljc/b;
    .locals 1

    sget-object v0, Lec/t;->a:Lec/u;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    move-object v0, p0

    check-cast v0, Lec/p;

    invoke-virtual {v0}, Lec/o;->a()Ljc/g$a;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    invoke-interface {v0, v1}, Ljc/b;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
