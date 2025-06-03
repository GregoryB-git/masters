.class public final Ljb/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljb/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lxc/f;

.field public b:[Ljb/d;

.field public c:I

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(Lxc/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [Ljb/d;

    iput-object v0, p0, Ljb/e$b;->b:[Ljb/d;

    const/4 v0, 0x7

    iput v0, p0, Ljb/e$b;->d:I

    iput-object p1, p0, Ljb/e$b;->a:Lxc/f;

    return-void
.end method


# virtual methods
.method public final a(III)V
    .locals 1

    if-ge p1, p2, :cond_0

    iget-object p2, p0, Ljb/e$b;->a:Lxc/f;

    or-int/2addr p1, p3

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ljb/e$b;->a:Lxc/f;

    or-int/2addr p3, p2

    invoke-virtual {v0, p3}, Lxc/f;->B0(I)V

    sub-int/2addr p1, p2

    :goto_0
    const/16 p2, 0x80

    if-lt p1, p2, :cond_1

    and-int/lit8 p3, p1, 0x7f

    iget-object v0, p0, Ljb/e$b;->a:Lxc/f;

    or-int/2addr p2, p3

    invoke-virtual {v0, p2}, Lxc/f;->B0(I)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    :cond_1
    iget-object p2, p0, Ljb/e$b;->a:Lxc/f;

    :goto_1
    invoke-virtual {p2, p1}, Lxc/f;->B0(I)V

    return-void
.end method
