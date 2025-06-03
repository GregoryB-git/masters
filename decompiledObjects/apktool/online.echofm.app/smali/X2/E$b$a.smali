.class public LX2/E$b$a;
.super LX2/f0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX2/E$b;->listIterator(I)Ljava/util/ListIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:LX2/E$b;


# direct methods
.method public constructor <init>(LX2/E$b;Ljava/util/ListIterator;)V
    .locals 0

    .line 1
    iput-object p1, p0, LX2/E$b$a;->p:LX2/E$b;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LX2/f0;-><init>(Ljava/util/ListIterator;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LX2/E$b$a;->p:LX2/E$b;

    .line 2
    .line 3
    iget-object v0, v0, LX2/E$b;->p:LW2/g;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LW2/g;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
