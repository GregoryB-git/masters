.class public final Lea/w$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea/w;-><init>(Landroid/content/Context;Lub/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lqc/e<",
        "Lea/p;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lqc/e;

.field public final synthetic b:Lea/w;


# direct methods
.method public constructor <init>(Lqc/i;Lea/w;)V
    .locals 0

    iput-object p1, p0, Lea/w$f;->a:Lqc/e;

    iput-object p2, p0, Lea/w$f;->b:Lea/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(Lqc/f;Lub/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lea/w$f;->a:Lqc/e;

    new-instance v1, Lea/w$f$a;

    iget-object v2, p0, Lea/w$f;->b:Lea/w;

    invoke-direct {v1, p1, v2}, Lea/w$f$a;-><init>(Lqc/f;Lea/w;)V

    invoke-interface {v0, v1, p2}, Lqc/e;->collect(Lqc/f;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lvb/a;->a:Lvb/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method
