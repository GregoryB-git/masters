.class public final Lc3/n$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc3/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lc3/g;

.field public final b:Lc3/k;

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(Lc3/g;Lc3/k;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc3/n$b;->a:Lc3/g;

    iput-object p2, p0, Lc3/n$b;->b:Lc3/k;

    iput p3, p0, Lc3/n$b;->c:I

    iput-boolean p4, p0, Lc3/n$b;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Lc3/g;Lc3/k;IZLc3/n$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lc3/n$b;-><init>(Lc3/g;Lc3/k;IZ)V

    return-void
.end method


# virtual methods
.method public a()Lc3/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/n$b;->a:Lc3/g;

    .line 2
    .line 3
    return-object v0
.end method
