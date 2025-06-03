.class public final synthetic Lv3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln7/e;
.implements Lv5/l$a;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lw3/b$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lw3/w;

    check-cast p1, Lv5/c;

    invoke-direct {v0, p1}, Lw3/w;-><init>(Lv5/c;)V

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lw3/b;

    invoke-interface {p1}, Lw3/b;->F()V

    return-void
.end method
