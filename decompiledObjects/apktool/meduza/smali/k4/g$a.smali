.class public final Lk4/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lk4/j;

.field public final b:Lk4/m;

.field public final c:Lc4/v;

.field public final d:Lc4/w;

.field public e:I


# direct methods
.method public constructor <init>(Lk4/j;Lk4/m;Lc4/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk4/g$a;->a:Lk4/j;

    iput-object p2, p0, Lk4/g$a;->b:Lk4/m;

    iput-object p3, p0, Lk4/g$a;->c:Lc4/v;

    iget-object p1, p1, Lk4/j;->f:Lv3/i0;

    iget-object p1, p1, Lv3/i0;->t:Ljava/lang/String;

    const-string p2, "audio/true-hd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lc4/w;

    invoke-direct {p1}, Lc4/w;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lk4/g$a;->d:Lc4/w;

    return-void
.end method
