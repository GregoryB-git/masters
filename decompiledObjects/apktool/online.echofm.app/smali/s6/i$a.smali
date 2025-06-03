.class public final Ls6/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls6/i;->a(Ls6/b;LX5/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic o:Lkotlin/jvm/internal/u;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls6/i$a;->o:Lkotlin/jvm/internal/u;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public emit(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p2, p0, Ls6/i$a;->o:Lkotlin/jvm/internal/u;

    .line 2
    .line 3
    iput-object p1, p2, Lkotlin/jvm/internal/u;->o:Ljava/lang/Object;

    .line 4
    .line 5
    new-instance p1, Lt6/a;

    .line 6
    .line 7
    invoke-direct {p1, p0}, Lt6/a;-><init>(Ls6/c;)V

    .line 8
    .line 9
    .line 10
    throw p1
.end method
