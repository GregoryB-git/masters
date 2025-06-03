.class public final Lqc/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lqc/f<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lec/s;


# direct methods
.method public constructor <init>(Lec/s;)V
    .locals 0

    iput-object p1, p0, Lqc/o;->a:Lec/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lqc/o;->a:Lec/s;

    iput-object p1, p2, Lec/s;->a:Ljava/lang/Object;

    new-instance p1, Lrc/a;

    invoke-direct {p1, p0}, Lrc/a;-><init>(Lqc/f;)V

    throw p1
.end method
