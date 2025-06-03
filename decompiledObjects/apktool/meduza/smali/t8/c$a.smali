.class public final Lt8/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt8/c$a$a;
    }
.end annotation


# static fields
.field public static final a:Le0/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le0/e;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Le0/e;-><init>(I)V

    sput-object v0, Lt8/c$a;->a:Le0/e;

    return-void
.end method
