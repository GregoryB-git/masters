.class public final Lz2/U;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lx2/b;


# direct methods
.method public constructor <init>(Lx2/b;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lz2/U;->b:Lx2/b;

    .line 8
    .line 9
    iput p2, p0, Lz2/U;->a:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lz2/U;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()Lx2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/U;->b:Lx2/b;

    .line 2
    .line 3
    return-object v0
.end method
