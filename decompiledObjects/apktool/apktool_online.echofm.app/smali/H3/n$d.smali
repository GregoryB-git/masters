.class public LH3/n$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH3/n;->d(LV2/j;)LV2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LH3/n;


# direct methods
.method public constructor <init>(LH3/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH3/n$d;->a:LH3/n;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(LV2/j;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LH3/n$d;->b(LV2/j;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(LV2/j;)Ljava/lang/Void;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method
