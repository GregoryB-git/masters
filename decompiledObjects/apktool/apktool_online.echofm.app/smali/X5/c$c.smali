.class public final LX5/c$c;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lg6/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX5/c;->writeReplace()Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic o:[LX5/g;

.field public final synthetic p:Lkotlin/jvm/internal/t;


# direct methods
.method public constructor <init>([LX5/g;Lkotlin/jvm/internal/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, LX5/c$c;->o:[LX5/g;

    .line 2
    .line 3
    iput-object p2, p0, LX5/c$c;->p:Lkotlin/jvm/internal/t;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(LV5/t;LX5/g$b;)V
    .locals 3

    .line 1
    const-string v0, "<anonymous parameter 0>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "element"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LX5/c$c;->o:[LX5/g;

    .line 12
    .line 13
    iget-object v0, p0, LX5/c$c;->p:Lkotlin/jvm/internal/t;

    .line 14
    .line 15
    iget v1, v0, Lkotlin/jvm/internal/t;->o:I

    .line 16
    .line 17
    add-int/lit8 v2, v1, 0x1

    .line 18
    .line 19
    iput v2, v0, Lkotlin/jvm/internal/t;->o:I

    .line 20
    .line 21
    aput-object p2, p1, v1

    .line 22
    .line 23
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LV5/t;

    .line 2
    .line 3
    check-cast p2, LX5/g$b;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LX5/c$c;->a(LV5/t;LX5/g$b;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LV5/t;->a:LV5/t;

    .line 9
    .line 10
    return-object p1
.end method
