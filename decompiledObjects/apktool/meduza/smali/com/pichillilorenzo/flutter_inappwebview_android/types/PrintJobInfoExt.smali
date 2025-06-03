.class public Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private attributes:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;

.field private copies:I

.field private creationTime:J

.field private label:Ljava/lang/String;

.field private numberOfPages:Ljava/lang/Integer;

.field private printerId:Ljava/lang/String;

.field private state:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fromPrintJobInfo(Landroid/print/PrintJobInfo;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;

    invoke-direct {v1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;-><init>()V

    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getState()I

    move-result v2

    iput v2, v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->state:I

    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getCopies()I

    move-result v2

    iput v2, v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->copies:I

    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getPages()[Landroid/print/PageRange;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getPages()[Landroid/print/PageRange;

    move-result-object v2

    array-length v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    iput-object v2, v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->numberOfPages:Ljava/lang/Integer;

    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getCreationTime()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->creationTime:J

    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getLabel()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->label:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getPrinterId()Landroid/print/PrinterId;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getPrinterId()Landroid/print/PrinterId;

    move-result-object v0

    invoke-virtual {v0}, Landroid/print/PrinterId;->getLocalId()Ljava/lang/String;

    move-result-object v0

    :cond_2
    iput-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->printerId:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getAttributes()Landroid/print/PrintAttributes;

    move-result-object p0

    invoke-static {p0}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->fromPrintAttributes(Landroid/print/PrintAttributes;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;

    move-result-object p0

    iput-object p0, v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->attributes:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;

    return-object v1
.end method


# virtual methods
.method public toMap()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->state:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "state"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->copies:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "copies"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->numberOfPages:Ljava/lang/Integer;

    const-string v2, "numberOfPages"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->creationTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "creationTime"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->label:Ljava/lang/String;

    const-string v2, "label"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->printerId:Ljava/lang/String;

    const-string v3, "id"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "printer"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->attributes:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->toMap()Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "attributes"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
