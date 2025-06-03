.class public LK5/n$a;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK5/n;->o()LV2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Z

.field public final synthetic p:LK5/n;


# direct methods
.method public constructor <init>(LK5/n;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LK5/n$a;->p:LK5/n;

    .line 2
    .line 3
    iput-boolean p2, p0, LK5/n$a;->o:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string p2, "unsentReports"

    .line 13
    .line 14
    invoke-virtual {p0, p2, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method
