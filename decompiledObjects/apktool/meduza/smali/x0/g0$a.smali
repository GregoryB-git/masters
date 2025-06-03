.class public final Lx0/g0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:Lx0/i;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Lb1/k$b;

.field public i:Lb1/k$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILx0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lx0/g0$a;->a:I

    iput-object p2, p0, Lx0/g0$a;->b:Lx0/i;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx0/g0$a;->c:Z

    sget-object p1, Lb1/k$b;->e:Lb1/k$b;

    iput-object p1, p0, Lx0/g0$a;->h:Lb1/k$b;

    iput-object p1, p0, Lx0/g0$a;->i:Lb1/k$b;

    return-void
.end method

.method public constructor <init>(Lx0/i;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lx0/g0$a;->a:I

    iput-object p1, p0, Lx0/g0$a;->b:Lx0/i;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lx0/g0$a;->c:Z

    sget-object p1, Lb1/k$b;->e:Lb1/k$b;

    iput-object p1, p0, Lx0/g0$a;->h:Lb1/k$b;

    iput-object p1, p0, Lx0/g0$a;->i:Lb1/k$b;

    return-void
.end method
