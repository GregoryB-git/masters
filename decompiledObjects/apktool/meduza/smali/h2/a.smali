.class public final Lh2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/i;


# instance fields
.field public final b:Li2/i;

.field public final c:Lg2/b;


# direct methods
.method public constructor <init>(Li2/j;)V
    .locals 1

    new-instance v0, Lg2/b;

    invoke-direct {v0}, Lg2/b;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/a;->b:Li2/i;

    iput-object v0, p0, Lh2/a;->c:Lg2/b;

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)Lqc/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            ")",
            "Lqc/e<",
            "Li2/k;",
            ">;"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh2/a;->b:Li2/i;

    invoke-interface {v0, p1}, Li2/i;->a(Landroid/app/Activity;)Lqc/e;

    move-result-object p1

    return-object p1
.end method
