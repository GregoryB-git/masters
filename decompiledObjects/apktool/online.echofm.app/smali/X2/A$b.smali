.class public LX2/A$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field private static final serialVersionUID:J


# instance fields
.field public final o:Ljava/util/Comparator;

.field public final p:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LX2/A$b;->o:Ljava/util/Comparator;

    .line 5
    .line 6
    iput-object p2, p0, LX2/A$b;->p:[Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public readResolve()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LX2/A$a;

    .line 2
    .line 3
    iget-object v1, p0, LX2/A$b;->o:Ljava/util/Comparator;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LX2/A$a;-><init>(Ljava/util/Comparator;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LX2/A$b;->p:[Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, LX2/A$a;->n([Ljava/lang/Object;)LX2/A$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, LX2/A$a;->p()LX2/A;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method
