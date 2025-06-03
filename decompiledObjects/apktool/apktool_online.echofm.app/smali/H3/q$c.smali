.class public LH3/q$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH3/q;->b0()LV2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LH3/q;


# direct methods
.method public constructor <init>(LH3/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH3/q$c;->a:LH3/q;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)LV2/j;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LH3/q$c;->b(Ljava/lang/Void;)LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(Ljava/lang/Void;)LV2/j;
    .locals 0

    .line 1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-static {p1}, LV2/m;->e(Ljava/lang/Object;)LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
