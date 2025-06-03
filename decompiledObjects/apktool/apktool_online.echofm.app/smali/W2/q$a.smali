.class public LW2/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW2/q$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW2/q;->e(LW2/d;)LW2/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LW2/d;


# direct methods
.method public constructor <init>(LW2/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW2/q$a;->a:LW2/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(LW2/q;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LW2/q$a;->b(LW2/q;Ljava/lang/CharSequence;)LW2/q$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(LW2/q;Ljava/lang/CharSequence;)LW2/q$b;
    .locals 1

    .line 1
    new-instance v0, LW2/q$a$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LW2/q$a$a;-><init>(LW2/q$a;LW2/q;Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
